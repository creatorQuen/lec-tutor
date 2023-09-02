package lec25;

import org.jetbrains.annotations.NotNull;

public class GeoDataCloudDataSource implements DataSource<GeoData> {

    @NotNull
    @Override
    public GeoData getData() {
        return new GeoData(12, 52.12, 43.43);
    }
}
