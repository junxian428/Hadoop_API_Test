package org.example;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HdfsClient {

    @Test
    public void testmkdir() throws URISyntaxException, IOException {
        URI uri = new URI("hdfs://hadoop100:8020");
        Configuration configuration = new Configuration();

        FileSystem fs = FileSystem.get(uri,configuration);
        fs.mkdirs(new Path("/junxian428/FYP"));
        fs.close();


    }

    @Test
    public void testPut()  throws URISyntaxException, IOException, NullPointerException{
        URI uri = new URI("hdfs://hadoop100:8020");
        Configuration configuration = new Configuration();

        FileSystem fs = FileSystem.get(uri,configuration);
        fs.copyFromLocalFile(false,false, new Path("C:\\Users\\junxian428\\Downloads\\MicrosoftTeams-image.png"),new Path("hdfs://hadoop100/junxian428"));
    }
}
