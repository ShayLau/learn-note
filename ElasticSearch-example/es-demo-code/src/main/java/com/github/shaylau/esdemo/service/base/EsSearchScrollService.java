package com.github.shaylau.esdemo.service.base;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchScrollRequest;

/**
 * @Author: ShayLau
 * @Date: 2020/8/24 16:27
 */
public interface EsSearchScrollService {

    /**
     * 卷轴查询
     *
     * @param searchScrollRequest
     * @return
     */
    SearchResponse searchScroll(SearchScrollRequest searchScrollRequest);

}
