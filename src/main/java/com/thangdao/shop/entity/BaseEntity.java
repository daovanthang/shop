package com.thangdao.shop.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.thangdao.shop.common.util.DateUtils;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity {
	/*
	 * Refactor lại project
	 * 1. sử dụng lombok
	 * 2. tất cả các quan hệ trong entity được fetch kiểu lazy
	 * 3. tất cả các quan hệ trong entity được @JsonIgnore
	 * 4. format datetime thống nhất cho toàn bộ project
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false)
	protected Long id;
	
	@Version
	@Column(columnDefinition = "integer DEFAULT 0", nullable = false)
	protected int version;
	
	@CreatedBy
	protected String createdBy;
	
	@CreatedDate
	@DateTimeFormat(pattern = DateUtils.DATE_FORMAT)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateUtils.DATE_FORMAT)
	protected LocalDateTime createdAt;
	
	@LastModifiedBy
	protected String updatedBy;
	
	@LastModifiedDate
	@DateTimeFormat(pattern = DateUtils.DATE_FORMAT)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateUtils.DATE_FORMAT)
	protected LocalDateTime updatedAt;
}
