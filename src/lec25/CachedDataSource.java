package lec25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.xml.crypto.Data;

//public class CachedDataSource extends DataSource {
//
//    private MyData myData;
//
//    @Nullable
//    @Override
//    public MyData getData() {
//        return null;
//    }
//
//    @Override
//    public void saveData(@NotNull MyData data) {
//        myData = data;
//    }
//}

public class CachedDataSource<T> implements MutableDataSource<T> {
    private T myData;

    @Nullable
    @Override
    public T getData() {
        return myData;
    }

    @Override
    public void saveData(@NotNull T data) {
        myData = data;
    }
}