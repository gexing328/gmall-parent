package com.atguigu.gmall.product.service;


import com.atguigu.gmall.model.product.SkuImage;
import com.atguigu.gmall.model.product.SkuInfo;
import com.atguigu.gmall.model.to.SkuDetailTo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.List;

/**
* @author 葛星
* @description 针对表【sku_info(库存单元表)】的数据库操作Service
* @createDate 2022-08-24 16:32:47
*/
public interface SkuInfoService extends IService<SkuInfo> {

    void saveSkuInfo(SkuInfo info);

    /**
     * 下架
     * @param skuId
     */
    void cancelSale(Long skuId);

    /**
     * 上架
     * @param skuId
     */
    void onSale(Long skuId);
    /**
     * 获取Sku商品详情数据
     * @param skuId
     * @return
     */
    SkuDetailTo getSkuDetail(Long skuId);

    /**
     * 获取sku的实时价格
     * @param skuId
     * @return
     */
    BigDecimal get1010Price(Long skuId);

    /**
     * 获取sku_info信息
     * @param skuId
     * @return
     */
    SkuInfo getDetailSkuInfo(Long skuId);

    /**
     * 获取sku的所有图片
     * @param skuId
     * @return
     */
    List<SkuImage> getDetailSkuImages(Long skuId);
}
