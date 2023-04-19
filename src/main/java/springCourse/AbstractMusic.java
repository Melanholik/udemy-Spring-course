package springCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class AbstractMusic implements Music {
    List<String> songsList = new ArrayList<>();

    @Override
    public String getSong(){
        Random random = new Random();
        int index = random.nextInt(songsList.size());
        return songsList.get(index);
    }

}
