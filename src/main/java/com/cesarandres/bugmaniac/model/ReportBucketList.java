package com.cesarandres.bugmaniac.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "data", "cursor" })
public class ReportBucketList {

	@JsonProperty("data")
	private List<ReportBucket> data = new ArrayList<ReportBucket>();
	@JsonProperty("next_cursor")
	private String cursorNext;
	
	/**
	 * 
	 * @return The cursor
	 */
	@JsonProperty("next_cursor")
	public String getCursorNext() {
		return cursorNext;
	}

	/**
	 * 
	 * @param cursor
	 *            The cursor
	 */
	@JsonProperty("next_cursor")
	public void setCursorNext(String cursor) {
		this.cursorNext = cursor;
	}
	
	/**
	 * 
	 * @return The data
	 */
	@JsonProperty("data")
	public List<ReportBucket> getData() {
		return data;
	}

	/**
	 * 
	 * @param data
	 *            The data
	 */
	@JsonProperty("data")
	public void setData(List<ReportBucket> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}