package eu.arrowhead.common.database.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "qos_inter_relay_echo_measurement_log_details")
public class QoSInterRelayEchoMeasurementLogDetails {

	//=================================================================================================
	// members

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "measurement_log_id", referencedColumnName = "id", nullable = false, unique = true)
	private QoSInterRelayEchoMeasurementLog measurementLog;

	@Column(name = "measurement_sequenece_number", nullable = false)
	private int measurementSequeneceNumber;

	@Column(name = "timeout_flag", nullable = false)
	private boolean timeoutFlag = false;

	@Column(name = "error_message", nullable = true)
	private String errorMessage;

	@Column(name = "throwable", nullable = true)
	private String throwable;

	@Column(name = "size_", nullable = true)
	private Integer size;

	@Column(name = "duration", nullable = true)
	private Integer duration;

	@Column(name = "measured_at", nullable = false)
	private ZonedDateTime measuredAt;

	@Column(nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private ZonedDateTime createdAt;

	@Column(nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private ZonedDateTime updatedAt;

	//=================================================================================================
	// methods

	//-------------------------------------------------------------------------------------------------
	public QoSInterRelayEchoMeasurementLogDetails() {}

	//-------------------------------------------------------------------------------------------------
	@PrePersist
	public void onCreate() {
		this.createdAt = ZonedDateTime.now();
		this.updatedAt = this.createdAt;
	}

	//-------------------------------------------------------------------------------------------------
	@PreUpdate
	public void onUpdate() {
		this.updatedAt = ZonedDateTime.now();
	}

	//-------------------------------------------------------------------------------------------------
	public QoSInterRelayEchoMeasurementLog getMeasurementLog() { return measurementLog; }
	public int getMeasurementSequeneceNumber() { return measurementSequeneceNumber; }
	public boolean isTimeoutFlag() { return timeoutFlag; }
	public String getErrorMessage() { return errorMessage; }
	public String getThrowable() { return throwable; }
	public Integer getSize() { return size; }
	public Integer getDuration() { return duration; }
	public ZonedDateTime getMeasuredAt() { return measuredAt; }

	//-------------------------------------------------------------------------------------------------
	public void setMeasurementLog(final QoSInterRelayEchoMeasurementLog measurementLog) { this.measurementLog = measurementLog; }
	public void setMeasurementSequeneceNumber(final int measurementSequeneceNumber) { this.measurementSequeneceNumber = measurementSequeneceNumber; }
	public void setTimeoutFlag(final boolean timeoutFlag) { this.timeoutFlag = timeoutFlag; }
	public void setErrorMessage(final String errorMessage) { this.errorMessage = errorMessage; }
	public void setThrowable(final String throwable) { this.throwable = throwable; }
	public void setSize(final Integer size) { this.size = size; }
	public void setDuration(final Integer duration) { this.duration = duration; }
	public void setMeasuredAt(final ZonedDateTime measuredAt) { this.measuredAt = measuredAt; }

}

