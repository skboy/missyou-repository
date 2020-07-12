package com.missyou.repository.core.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.missyou.commons.base.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
public class CoreUser extends BaseDomain {

	private static final long serialVersionUID = -2794647219717011949L;



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


}