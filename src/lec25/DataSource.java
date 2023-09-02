package lec25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//public abstract class DataSource {
//
//    @Nullable
//    public abstract MyData getData();
//
//    public abstract void saveData(@NotNull MyData data);
//}

//public interface DataSource {
//
//    @Nullable
//    MyData getData();
//}

public interface DataSource<T> {

    @Nullable
    T getData();
}