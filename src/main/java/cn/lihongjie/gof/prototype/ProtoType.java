package cn.lihongjie.gof.prototype;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 克隆一个对象
 * 已有一个复杂的对象，需要创建一个类似的新对象
 *
 * 把原有的克隆一个，再编辑
 *
 *
 * 为什么要这么做：应为再次从头创建代价比较大
 * @param <T>
 */
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
