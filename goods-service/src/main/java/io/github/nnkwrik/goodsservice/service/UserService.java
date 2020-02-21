package io.github.nnkwrik.goodsservice.service;

import io.github.nnkwrik.goodsservice.model.po.Goods;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author nnkwrik
 * @date 18/11/27 20:37
 */
public interface UserService {

    Boolean userHasCollect(String userId, int goodsId);

    void collectAddOrDelete(int goodsId, String userId, boolean hasCollect);

    List<Goods> getUserCollectList(String userId, int page, int size);

    List<Goods> getUserBought(String buyerId, int page, int size);

    List<Goods> getUserSold(String sellerId, int page, int size);

    List<Goods> getUserPosted(String userId, int page, int size);

    LinkedHashMap<String, List<Goods>> getUserHistoryList(String userId, int page, int size);

    void addWant(int goodsId, String userId);
}
