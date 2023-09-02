package lec25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//public interface MutableDataSource {
//    @Nullable
//    MyData getData();
//
//    void saveData(@NotNull MyData data);
//}

//public interface MutableDataSource extends DataSource {
//    void saveData(@NotNull MyData data);
//}

public interface MutableDataSource<T> extends DataSource<T> {
    void saveData(@NotNull T data);
}