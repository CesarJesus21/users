package mx.com.jcesar.user.utils;

import lombok.Getter;

@Getter
public class SearchCriteria {
    private String key;
    private String valude;


    public SearchCriteria(String key, String valude) {
        this.key = key;
        this.valude = valude;
    }
}
