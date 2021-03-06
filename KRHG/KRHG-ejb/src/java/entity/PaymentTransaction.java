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

@Entity
public class PaymentTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionID;
    private double totalPrice;
    private double initialPayment;
    private double finalPayment;
    private String paymentType;
    private String firstName;
    private String lastName;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date transactionDateTime;
    @OneToOne
    private CreditCard creditCard;
    @OneToOne
    private Customer payer;
    @OneToOne
    private FunctionRoomBooking functionRoomBooked;
    @OneToOne
    private TransportBooking transportBooked;
    @OneToMany
    private List<RoomBooking> roomsBooked;

    public PaymentTransaction() {
        roomsBooked = new ArrayList<>();
    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getInitialPayment() {
        return initialPayment;
    }

    public void setInitialPayment(double initialPayment) {
        this.initialPayment = initialPayment;
    }

    public double getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(double finalPayment) {
        this.finalPayment = finalPayment;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Customer getPayer() {
        return payer;
    }

    public void setPayer(Customer payer) {
        this.payer = payer;
    }

    public Date getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(Date transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public List<RoomBooking> getRoomsBooked() {
        return roomsBooked;
    }

    public void setRoomsBooked(List<RoomBooking> roomsBooked) {
        this.roomsBooked = roomsBooked;
    }

    public FunctionRoomBooking getFunctionRoomBooked() {
        return functionRoomBooked;
    }

    public void setFunctionRoomBooked(FunctionRoomBooking functionRoomBooked) {
        this.functionRoomBooked = functionRoomBooked;
    }

    public TransportBooking getTransportBooked() {
        return transportBooked;
    }

    public void setTransportBooked(TransportBooking transportBooked) {
        this.transportBooked = transportBooked;
    }

    public void addRoomBooking(RoomBooking roomBooking) throws NoResultException {
        if (roomBooking != null && !this.getRoomsBooked().contains(roomBooking)) {
            this.getRoomsBooked().add(roomBooking);
        } else {
            throw new NoResultException("Roombooking already added to Payment Transaction");
        }
    }

    public void removeRoomBooking(RoomBooking roomBooking) throws NoResultException {
        if (roomBooking != null && this.getRoomsBooked().contains(roomBooking)) {
            this.getRoomsBooked().remove(roomBooking);
        } else {
            throw new NoResultException("Roombooking has not been added to Payment Transaction");
        }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionID != null ? transactionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentTransaction)) {
            return false;
        }
        PaymentTransaction other = (PaymentTransaction) object;
        if ((this.transactionID == null && other.transactionID != null) || (this.transactionID != null && !this.transactionID.equals(other.transactionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PaymentTransaction[ transactionID=" + transactionID + " ]";
    }

}
