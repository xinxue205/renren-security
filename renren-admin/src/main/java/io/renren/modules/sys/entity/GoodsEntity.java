package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品管理
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-22 10:02:06
 */
@Data
@TableName("tb_goods")
public class GoodsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long goodsId;
	/**
	 * 商品名
	 */
	private String name;
	/**
	 * 介绍
	 */
	private String intro;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 数量
	 */
	private Integer num;

}
