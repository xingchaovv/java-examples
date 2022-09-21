package java_base_lang.annotation.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Msg {

    private Long id;
    private Integer status;
    private String desc;
}
