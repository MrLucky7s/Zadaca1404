package osc.ada;

import java.util.ArrayList;
import java.util.List;

public class NewsList {
    private List<News> list = new ArrayList<>();

    public void addNews(News news){
        list.add(news);
    }

    public int size(){
        return list.size();
    }

    public News getNews(int i){
        return list.get(i);
    }

    public void removeNewsAt(int i){
        list.remove(i);
    }

}
