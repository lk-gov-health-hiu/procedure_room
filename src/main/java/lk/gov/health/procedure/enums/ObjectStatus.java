/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.procedure.enums;

/**
 *
 * @author user
 */
public enum ObjectStatus {
    ACTIVE("Active"),
    INACTIVE("Deactivated"),
    RETIRED("Retired");

    private final String label;

    private ObjectStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
