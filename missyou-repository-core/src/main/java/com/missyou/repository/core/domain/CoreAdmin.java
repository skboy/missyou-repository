package com.missyou.repository.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 管理员表
 *
 * @author skboy
 * @since v1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CoreAdmin implements Serializable {

	private static final long serialVersionUID = 2103975218208317639L;

	/**
	 * 主键 <br>
	 * 生成策略：ASSIGN_ID
	 */
	@TableId(value = "id", type = IdType.ASSIGN_ID)
	private Long id;

	/**
	 * 账号
	 */
	@NotBlank(message = "账号为必填项")
	private String username;

	/**
	 * 密码
	 */
	@NotBlank(message = "密码为必填项")
	@Length(min = 6, max = 20, message = "密码长度在 6 - 20 位字符之间")
	private String password;

	/**
	 * 昵称
	 */
	@NotBlank(message = "昵称为必填项")
	private String nickname;

	/**
	 * 邮箱
	 */
	@NotBlank(message = "邮箱地址为必填项")
	@Email(message = "请输入正确的邮箱地址")
	private String email;

	/**
	 * 用户状态：1(已启用) 0(已禁用)
	 */
	private Integer status;

	/**
	 * 逻辑删除：1(已删除) 0(未删除)
	 */
	@TableField(value = "is_deleted")
	private Boolean deleted;

	/**
	 * 创建时间
	 */
	@TableField(value = "create_time")
	private LocalDateTime createTime;

	/**
	 * 修改时间
	 */
	@TableField(value = "update_time")
	private LocalDateTime updateTime;

}