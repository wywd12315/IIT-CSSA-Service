package io.github.nnkwrik.goodsservice.service;

import io.github.nnkwrik.goodsservice.model.po.Goods;
import io.github.nnkwrik.goodsservice.model.po.GoodsGallery;
import io.github.nnkwrik.goodsservice.model.vo.CategoryPageVo;
import io.github.nnkwrik.goodsservice.model.vo.CommentVo;

import java.util.List;

/**
 * @author nnkwrik
 * @date 18/11/17 21:14
 */
public interface GoodsService {

    CategoryPageVo getGoodsAndBrotherCateById(int id, int page, int size);

    List<Goods> getGoodsByCateId(int id, int page, int size);

    Goods getGoodsDetail(int goodsId);

    int getSellerHistory(String sellerId);

    List<GoodsGallery> getGoodsGallery(int goodsId);

    List<Goods> getGoodsRelated(int goodsId, int page, int size);

    List<CommentVo> getGoodsComment(int goodsId);

    void addComment(int goodsId, String userId, int replyCommentId, String replyUserId, String content);

}
