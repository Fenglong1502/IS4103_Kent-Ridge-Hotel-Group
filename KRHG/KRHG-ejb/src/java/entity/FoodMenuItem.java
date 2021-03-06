/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodMenuItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodMenuItemID;
    private String foodMenuItemName;
    private String foodMenuItemDescription;
    private boolean availability;
    private Double unitPrice;
    private String category;
    private String foodImage;
    private boolean status;
    
    public FoodMenuItem(){
        status = true;
    }

    public FoodMenuItem(String foodMenuItemName, String foodMenuItemDescription, String category, Boolean availability, Double unitPrice, String foodImage){
        this.foodMenuItemName = foodMenuItemName;
        this.foodMenuItemDescription = foodMenuItemDescription;
        this.category = category;
        this.availability = availability;
        this.unitPrice = unitPrice;
        this.foodImage = foodImage; 
        this.status = true;
    }
  
    /**
     * @return the availability
     */
    public Boolean getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodMenuItemID != null ? foodMenuItemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FoodMenuItem)) {
            return false;
        }
        FoodMenuItem other = (FoodMenuItem) object;
        if ((this.foodMenuItemID == null && other.foodMenuItemID != null) || (this.foodMenuItemID != null && !this.foodMenuItemID.equals(other.foodMenuItemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.FoodMenuItem[ foodMenuItemID=" + foodMenuItemID + " ]";
    }

    public Long getFoodMenuItemID() {
        return foodMenuItemID;
    }

    public void setFoodMenuItemID(Long foodMenuItemID) {
        this.foodMenuItemID = foodMenuItemID;
    }

    public String getFoodMenuItemName() {
        return foodMenuItemName;
    }

    public void setFoodMenuItemName(String foodMenuItemName) {
        this.foodMenuItemName = foodMenuItemName;
    }

    public String getFoodMenuItemDescription() {
        return foodMenuItemDescription;
    }

    public void setFoodMenuItemDescription(String foodMenuItemDescription) {
        this.foodMenuItemDescription = foodMenuItemDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    /**
     * @return the status
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
