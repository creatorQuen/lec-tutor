package lec25;

import org.jetbrains.annotations.Nullable;

//public class Repository extends DataSource {
//
//    private final DataSource cloudDataSource;
//    private final DataSource cachedDataSource;
//
//    public Repository(DataSource cloudDataSource, DataSource cachedDataSource) {
//        this.cloudDataSource = cloudDataSource;
//        this.cachedDataSource = cachedDataSource;
//    }
//
//    @Nullable
//    @Override
//    public MyData getData() {
//        MyData result = cachedDataSource.getData();
//        if (result == null) {
//            result = cloudDataSource.getData();
//        }
//        return result;
//    }
//
//    @Override
//    public void saveData(@NotNull MyData data) {
//
//    }
//}

//public class Repository implements DataSource {
//
//    private final DataSource cloudDataSource;
//    private final MutableDataSource cachedDataSource;
//
//    public Repository(DataSource cloudDataSource, MutableDataSource cachedDataSource) {
//        this.cloudDataSource = cloudDataSource;
//        this.cachedDataSource = cachedDataSource;
//    }
//
//    @Nullable
//    @Override
//    public MyData getData() {
//        MyData result = cachedDataSource.getData();
//        if (result == null) {
//            print("no data in cache");
//            result = cloudDataSource.getData();
//            cachedDataSource.saveData(result);
//        } else {
//            print("getting from cache");
//        }
//        return result;
//    }
//
//    private void print(String text) { System.out.println(text); }
//}

public class Repository<T> implements DataSource<T> {

    private final DataSource<T> cloudDataSource;
    private final MutableDataSource<T> cachedDataSource;

    public Repository(DataSource<T> cloudDataSource, MutableDataSource<T> cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Nullable
    @Override
    public T getData() {
        T result = cachedDataSource.getData();
        if (result == null) {
            print("no data in cache");
            result = cloudDataSource.getData();
            cachedDataSource.saveData(result);
        } else {
            print("getting from cache");
        }
        return result;
    }

    private void print(String text) { System.out.println(text); }
}