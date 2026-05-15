package com.arihant.client.model.portfolio;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PositionBookData
 */

public class PositionBookData {
    @SerializedName("positions")
    private List<Position> positions = null;

    public PositionBookData positions(List<Position> positions) {
        this.positions = positions;
        return this;
    }

    public PositionBookData addPositionsItem(Position positionsItem) {
        if (this.positions == null) {
            this.positions = new ArrayList<Position>();
        }
        this.positions.add(positionsItem);
        return this;
    }

    /**
     * Get positions
     *
     * @return positions
     **/
    @Schema(description = "")
    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PositionBookData positionBookData = (PositionBookData) o;
        return Objects.equals(this.positions, positionBookData.positions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PositionBookData {\n");

        sb.append("positions: ").append(toIndentedString(positions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().replace("\n", "\n    ");
    }

}
