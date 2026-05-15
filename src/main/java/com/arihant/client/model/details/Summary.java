package com.arihant.client.model.details;

import java.util.Objects;

public class Summary {
    private String charges;

    public Summary(String charges) {
        this.charges = charges;
    }

    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Summary summary = (Summary) o;
        return Objects.equals(charges, summary.charges);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(charges);
    }

    @Override
    public String toString() {
        return "Summary{" +
                "charges='" + charges + '\'' +
                '}';
    }
}
