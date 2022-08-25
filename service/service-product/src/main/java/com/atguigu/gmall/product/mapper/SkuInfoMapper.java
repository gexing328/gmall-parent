package com.atguigu.gmall.product.mapper;

import com.atguigu.gmall.model.product.SkuInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 葛星
* @description 针对表【sku_info(库存单元表)】的数据库操作Mapper
* @createDate 2022-08-24 16:32:47
* @Entity com.atguigu.gmall.product.domain.SkuInfo
*/
public interface SkuInfoMapper extends BaseMapper<SkuInfo> {

    /**
     * 更新 sku的is_sale字段
     * @param skuId
     * @param sale
     */
    void updateIsSale(@Param("skuId") Long skuId,
                      @Param("sale") int sale);

}




