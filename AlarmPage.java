package wulianwang.entity;

import java.util.List;

public class AlarmPage {
	
	private int TotalPage;
	private int PageIndex;
	private int PageSize;
	private List<AlarmInfo> Alarms;
	public int getTotalPage() {
		return TotalPage;
	}
	public void setTotalPage(int totalPage) {
		TotalPage = totalPage;
	}
	public int getPageIndex() {
		return PageIndex;
	}
	public void setPageIndex(int pageIndex) {
		PageIndex = pageIndex;
	}
	public int getPageSize() {
		return PageSize;
	}
	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
	public List<AlarmInfo> getAlarms() {
		return Alarms;
	}
	public void setAlarms(List<AlarmInfo> alarms) {
		Alarms = alarms;
	}
	
	
}
