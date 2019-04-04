/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import error.NoResultException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author fengl
 */
@Entity
public class RoomBooking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomBookingID;
    @Temporal(TemporalType.DATE)
    private Date bookInDate;
    @Temporal(TemporalType.DATE)
    private Date bookOutDate;
    @Temporal(TemporalType.DATE)
    private Date bookingDate;
    private String status;
    private boolean hasTransport;
    private boolean hasExtraBed;
    private double price;
    @OneToOne
    private Room bookedRoom;
    @OneToOne
    private Customer bookedBy;
    @Temporal(TemporalType.DATE)
    private Date transportTime;
    private String pickUpLocation;
    private String emailAddress;
    private String passportNum;
    private String firstName;
    private String lastName;
    private String roomType;
    private List<LaundryOrder> listOfLaundryOrders;
    private List<FoodOrder> listOfFoodOrders;
    private List<MinibarItem> listOfMiniBarItem;

    public RoomBooking() {
        listOfLaundryOrders = new ArrayList<>();
        listOfFoodOrders = new ArrayList<>();
        listOfMiniBarItem = new ArrayList<>();

    }

    public Long getRoomBookingID() {
        return roomBookingID;
    }

    public void setRoomBookingID(Long roomBookingID) {
        this.roomBookingID = roomBookingID;
    }

    public Date getBookInDate() {
        return bookInDate;
    }

    public void setBookInDate(Date bookInDate) {
        this.bookInDate = bookInDate;
    }

    public Date getBookOutDate() {
        return bookOutDate;
    }

    public void setBookOutDate(Date bookOutDate) {
        this.bookOutDate = bookOutDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Room getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(Room bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    public boolean getHasTransport() {
        return hasTransport;
    }

    public void setHasTransport(boolean hasTransport) {
        this.hasTransport = hasTransport;
    }

    public Date getTransportTime() {
        return transportTime;
    }

    public void setTransportTime(Date transportTime) {
        this.transportTime = transportTime;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Customer getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(Customer bookedBy) {
        this.bookedBy = bookedBy;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

//    public void addHolidaySurcharge(HolidaySurcharge holidaySurcharge) throws NoResultException {
//        if (holidaySurcharge != null && !this.getHolidaySurcharges().contains(holidaySurcharge)) {
//            this.getHolidaySurcharges().add(holidaySurcharge);
//        } else {
//            throw new NoResultException("Holiday Surhcarge already added to Room Booking");
//        }
//    }
//
//    public void removeHolidaySurcharge(HolidaySurcharge holidaySurcharge) throws NoResultException {
//        if (holidaySurcharge != null && this.getHolidaySurcharges().contains(holidaySurcharge)) {
//            this.getHolidaySurcharges().remove(holidaySurcharge);
//        } else {
//            throw new NoResultException("Holiday Surcharge has not been added to Room Booking");
//        }
//    }
//
//    public void addExtraSurcharge(ExtraSurcharge extraSurcharge) throws NoResultException {
//        if (extraSurcharge != null && !this.getExtraSurcharge().contains(extraSurcharge)) {
//            this.getExtraSurcharge().add(extraSurcharge);
//        } else {
//            throw new NoResultException("Extra Surcharge is already added to Room Booking");
//        }
//    }
//
//    public void removeExtraSurcharge(ExtraSurcharge extraSurcharge) throws NoResultException {
//        if (extraSurcharge != null && this.getExtraSurcharge().contains(extraSurcharge)) {
//            this.getExtraSurcharge().remove(extraSurcharge);
//        } else {
//            throw new NoResultException("Extra Surcharge has not been added to Room Booking");
//        }
//    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomBookingID != null ? roomBookingID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomBooking)) {
            return false;
        }
        RoomBooking other = (RoomBooking) object;
        if ((this.roomBookingID == null && other.roomBookingID != null) || (this.roomBookingID != null && !this.roomBookingID.equals(other.roomBookingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.RoomBooking[ roomBookingID=" + roomBookingID + " ]";
    }

    /**
     * @return the hasExtraBed
     */
    public boolean getHasExtraBed() {
        return hasExtraBed;
    }

    /**
     * @param hasExtraBed the hasExtraBed to set
     */
    public void setHasExtraBed(boolean hasExtraBed) {
        this.hasExtraBed = hasExtraBed;
    }

    /**
     * @return the listOfLaundryOrders
     */
    public List<LaundryOrder> getListOfLaundryOrders() {
        return listOfLaundryOrders;
    }

    /**
     * @param listOfLaundryOrders the listOfLaundryOrders to set
     */
    public void setListOfLaundryOrders(List<LaundryOrder> listOfLaundryOrders) {
        this.listOfLaundryOrders = listOfLaundryOrders;
    }

    /**
     * @return the listOfFoodOrders
     */
    public List<FoodOrder> getListOfFoodOrders() {
        return listOfFoodOrders;
    }

    /**
     * @param listOfFoodOrders the listOfFoodOrders to set
     */
    public void setListOfFoodOrders(List<FoodOrder> listOfFoodOrders) {
        this.listOfFoodOrders = listOfFoodOrders;
    }

    /**
     * @return the listOfMiniBarItem
     */
    public List<MinibarItem> getListOfMiniBarItem() {
        return listOfMiniBarItem;
    }

    /**
     * @param listOfMiniBarItem the listOfMiniBarItem to set
     */
    public void setListOfMiniBarItem(List<MinibarItem> listOfMiniBarItem) {
        this.listOfMiniBarItem = listOfMiniBarItem;
    }

    public void addLaundryOrder(LaundryOrder lo) throws NoResultException {
        if (lo != null && !this.getListOfLaundryOrders().contains(lo)) {
            this.getListOfLaundryOrders().add(lo);
        } else {
            throw new NoResultException("Laundry Order already added to Room Booking");
        }
    }

    public void removeLaundryOrder(LaundryOrder lo) throws NoResultException {
        if (lo != null && this.getListOfLaundryOrders().contains(lo)) {
            this.getListOfLaundryOrders().remove(lo);
        } else {
            throw new NoResultException("Laundry Order has not been added to Room Booking");
        }
    }

    public void addFoodOrder(FoodOrder fo) throws NoResultException {
        if (fo != null && !this.getListOfFoodOrders().contains(fo)) {
            this.getListOfFoodOrders().add(fo);
        } else {
            throw new NoResultException("Food Order already added to Room Booking");
        }
    }

    public void removeFoodOrder(FoodOrder fo) throws NoResultException {
        if (fo != null && this.getListOfLaundryOrders().contains(fo)) {
            this.getListOfLaundryOrders().remove(fo);
        } else {
            throw new NoResultException("Food Order has not been added to Room Booking");
        }
    }

    public void addMiniBarItem(MinibarItem mbi) throws NoResultException {
        if (mbi != null && !this.getListOfMiniBarItem().contains(mbi)) {
            this.getListOfMiniBarItem().add(mbi);
        } else {
            throw new NoResultException("Minibar Item already added to Room Booking");
        }
    }

    public void removeMiniBarItem(MinibarItem mbi) throws NoResultException {
        if (mbi != null && this.getListOfMiniBarItem().contains(mbi)) {
            this.getListOfMiniBarItem().remove(mbi);
        } else {
            throw new NoResultException("Minibar Item has not been added to Room Booking");
        }
    }
}
