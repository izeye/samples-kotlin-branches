package languageguide.gettingstarted.idioms;

import java.lang.reflect.Field;

public class StringConverter {

    public <T> T fromString(String value, Class<T> clazz) {
        try {
            T t = clazz.newInstance();
            Field field = clazz.getDeclaredField("value");
            field.setAccessible(true);
            field.set(t, value);
            return t;
        } catch (InstantiationException | IllegalAccessException | NoSuchFieldException ex) {
            throw new RuntimeException(ex);
        }
    }

}
