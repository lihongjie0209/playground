package cn.lihongjie.gof.prototype;

import com.fasterxml.jackson.databind.ObjectMapper;

public interface ProtoType<T> {


    default T copy() {


        try {

            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(this);
            return (T) objectMapper.readValue(s, this.getClass());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
