package com.missyou.repository.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author skboy
 * @since 2020-06-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("core_user")
public class CoreUser implements Serializable {

	private static final long serialVersionUID = -2794647219717011949L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.ASSIGN_ID)
	private Long id;

	/**
	 * 登录名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 昵称
	 */
	private String nickname;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 网址
	 */
	private String url;

	/**
	 * 用户状态：1(已启用) 0(已禁用)
	 */
	private Integer status;

	/**
	 * 激活码
	 */
	private String activationKey;

	/**
	 * 逻辑删除：1(已删除) 0(未删除)
	 */
	private Integer isDeleted;

	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;

	/**
	 * 修改时间
	 */
	private LocalDateTime updateTime;

}