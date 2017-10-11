package com.ducetech.app.model.vo;

import com.ducetech.app.model.Dictionary;
import com.ducetech.framework.model.BaseQuery;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class DictionaryQuery extends BaseQuery<Dictionary> {

    private String nodeName;

}
