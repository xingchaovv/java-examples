package java_base_lang.genericprogram.genericclass.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Manager extends Employee {

    private Integer bonus;

    public void setName(String name) {
        super.name = name;
    }

    public String getName() {
        return super.name + "（Manager）";
    }
}
