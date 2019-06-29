package wulianwang.entity;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class AlarmInfo {
	"我是测试用户！！！"
	@XStreamAlias("AlarmID")
	public int AlarmID;
	@XStreamAlias("RoomID")
	public int RoomID;
	@XStreamAlias("RoomName")
	public String RoomName;
	@XStreamAlias("ObjectNmae")
	public String ObjectName;
	@XStreamAlias("AlarmContext")
	public String AlarmContext;
	@XStreamAlias("AlarmLevel")
	public String AlarmLevel;
	@XStreamAlias("CurrentStatus")
	public String CurrentStatus;
	@XStreamAlias("DealStatus")
	public String DealStatus;
	@XStreamAlias("UpdateTime")
	public Date UpdateTimeime;
	@XStreamAlias("DealTime")
	public Date DealTime;
	
	public String SchoolName;

	public int getAlarmID() {
		return AlarmID;
	}

	public void setAlarmID(int alarmID) {
		AlarmID = alarmID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}

	public String getRoomName() {
		return RoomName;
	}

	public void setRoomName(String roomName) {
		RoomName = roomName;
	}

	public String getObjectName() {
		return ObjectName;
	}

	public void setObjectName(String objectName) {
		ObjectName = objectName;
	}

	public String getAlarmContext() {
		return AlarmContext;
	}

	public void setAlarmContext(String alarmContext) {
		AlarmContext = alarmContext;
	}

	public String getAlarmLevel() {
		return AlarmLevel;
	}

	public void setAlarmLevel(String alarmLevel) {
		AlarmLevel = alarmLevel;
	}

	public String getCurrentStatus() {
		return CurrentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		CurrentStatus = currentStatus;
	}

	public String getDealStatus() {
		return DealStatus;
	}

	public void setDealStatus(String dealStatus) {
		DealStatus = dealStatus;
	}

	public Date getUpdateTimeime() {
		return UpdateTimeime;
	}

	public void setUpdateTimeime(Date updateTimeime) {
		UpdateTimeime = updateTimeime;
	}

	public Date getDealTime() {
		return DealTime;
	}

	public void setDealTime(Date dealTime) {
		DealTime = dealTime;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	@Override
	public String toString() {
		return "AlarmInfo [AlarmID=" + AlarmID + ", RoomID=" + RoomID + ", RoomName=" + RoomName + ", ObjectName="
				+ ObjectName + ", AlarmContext=" + AlarmContext + ", AlarmLevel=" + AlarmLevel + ", CurrentStatus="
				+ CurrentStatus + ", DealStatus=" + DealStatus + ", UpdateTimeime=" + UpdateTimeime + ", DealTime="
				+ DealTime + ", SchoolName=" + SchoolName + "]";
	}
	
	
}
