package Serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Region {
    public static String name="Telangana";
    private float area=54.8f;
    private String unit="m3";

    @Override
    public String toString(){
        return "Region{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", unit=" + unit +
                '}';

    }

}
