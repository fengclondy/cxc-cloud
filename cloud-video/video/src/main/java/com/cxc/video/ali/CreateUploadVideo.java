package com.cxc.video.ali;

/**
 * 视频上传返回结果
 * @author wanglei
 *
 */
public class CreateUploadVideo {
	
	private String videoId;
	private String uploadAddress;
	private String uploadAuth;
	private String requestId;
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getVideoId() {
		return videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	public String getUploadAddress() {
		return uploadAddress;
	}
	public void setUploadAddress(String uploadAddress) {
		this.uploadAddress = uploadAddress;
	}
	public String getUploadAuth() {
		return uploadAuth;
	}
	public void setUploadAuth(String uploadAuth) {
		this.uploadAuth = uploadAuth;
	}
}
