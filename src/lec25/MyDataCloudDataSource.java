package lec25;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//public class CloudDataSource extends DataSource {
//
//    @Nullable
//    @Override
//    public MyData getData() {
//        return new MyData(1, "description_1");
//    }
//
//    @Override
//    public void saveData(@NotNull MyData data) {
//
//    }
//}

//public class CloudDataSource implements DataSource {
//
//    @Nullable
//    @Override
//    public MyData getData() {
//        return new MyData(1, "description_1");
//    }
//}

public class MyDataCloudDataSource implements DataSource<MyData> {

    @Override
    public MyData getData() {
        return new MyData(1, "description_1");
    }
}