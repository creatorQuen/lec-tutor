package lec25;

public class Main {
    public static void main(String[] args) {
//        MyData data = getMyData();
//        if (data == null) {
//            print("object is null");
//        } else {
//            print(data.toString());
//        }

        //-- abstract class
//        DataSource repository = new Repository(
//                new CloudDataSource(),
//                new CachedDataSource()
//        );
//        MyData data = repository.getData();
//        print(data.toString());

        //-- interface
//        DataSource repository = new Repository(
//                new MyDataCloudDataSource(),
//                new MyDataCachedDataSource()
//        );
//        MyData data = repository.getData();
//        print(data.toString());
//        data = repository.getData();
//        print(data.toString());

        //Djenerics
        DataSource<MyData> myDataDataSource = new Repository<>(
                new MyDataCloudDataSource(),
                new CachedDataSource<>()
        );

        DataSource<GeoData> geoDataDataSource = new GeoRepository(
                new GeoDataCloudDataSource(),
                new CachedDataSource<>()
        );
        MyData data = myDataDataSource.getData();
        GeoData geoData = geoDataDataSource.getData();
        print(data.toString());
        print(geoData.toString());
    }

    private static MyData getMyData() {
        return null;
    }

    public static void print(Object obj) { System.out.println(obj); }
}
