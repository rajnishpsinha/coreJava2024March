package Serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roads extends Region implements Serializable  {

    private static String name;
    private float length;
    private transient float income;


    @Override
    public String toString() {
        return "Roads{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", income=" + income +
                ", region=" + super.name +
                ", area=" + super.getArea() +
                ", unit=" + super.getUnit() +
                '}';
    }

}
