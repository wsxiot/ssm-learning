package cn.wsxiot.bean;

public class MonitorSteadyAlarmDay {
    private Integer id;

    private String monitorId;

    private String statisticsDate;

    private Integer frequencyDeviationAlarm;

    private Integer voltageDeviationAlarm;

    private Integer harmonicVoltageAlarm;

    private Integer harmonicCurrentAlarm;

    private Integer interHarmonicVoltageAlarm;

    private Integer threePhaseVolImbalanceAlarm;

    private Integer negativeSequenceCurAlarm;

    private Integer longTimeFlickerAlarm;

    private Integer thduAlarm;

    public MonitorSteadyAlarmDay() {
    }

    public MonitorSteadyAlarmDay(Integer id, String monitorId, String statisticsDate, Integer frequencyDeviationAlarm, Integer voltageDeviationAlarm, Integer harmonicVoltageAlarm, Integer harmonicCurrentAlarm, Integer interHarmonicVoltageAlarm, Integer threePhaseVolImbalanceAlarm, Integer negativeSequenceCurAlarm, Integer longTimeFlickerAlarm, Integer thduAlarm) {
        this.id = id;
        this.monitorId = monitorId;
        this.statisticsDate = statisticsDate;
        this.frequencyDeviationAlarm = frequencyDeviationAlarm;
        this.voltageDeviationAlarm = voltageDeviationAlarm;
        this.harmonicVoltageAlarm = harmonicVoltageAlarm;
        this.harmonicCurrentAlarm = harmonicCurrentAlarm;
        this.interHarmonicVoltageAlarm = interHarmonicVoltageAlarm;
        this.threePhaseVolImbalanceAlarm = threePhaseVolImbalanceAlarm;
        this.negativeSequenceCurAlarm = negativeSequenceCurAlarm;
        this.longTimeFlickerAlarm = longTimeFlickerAlarm;
        this.thduAlarm = thduAlarm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(String monitorId) {
        this.monitorId = monitorId == null ? null : monitorId.trim();
    }

    public String getStatisticsDate() {
        return statisticsDate;
    }

    public void setStatisticsDate(String statisticsDate) {
        this.statisticsDate = statisticsDate == null ? null : statisticsDate.trim();
    }

    public Integer getFrequencyDeviationAlarm() {
        return frequencyDeviationAlarm;
    }

    public void setFrequencyDeviationAlarm(Integer frequencyDeviationAlarm) {
        this.frequencyDeviationAlarm = frequencyDeviationAlarm;
    }

    public Integer getVoltageDeviationAlarm() {
        return voltageDeviationAlarm;
    }

    public void setVoltageDeviationAlarm(Integer voltageDeviationAlarm) {
        this.voltageDeviationAlarm = voltageDeviationAlarm;
    }

    public Integer getHarmonicVoltageAlarm() {
        return harmonicVoltageAlarm;
    }

    public void setHarmonicVoltageAlarm(Integer harmonicVoltageAlarm) {
        this.harmonicVoltageAlarm = harmonicVoltageAlarm;
    }

    public Integer getHarmonicCurrentAlarm() {
        return harmonicCurrentAlarm;
    }

    public void setHarmonicCurrentAlarm(Integer harmonicCurrentAlarm) {
        this.harmonicCurrentAlarm = harmonicCurrentAlarm;
    }

    public Integer getInterHarmonicVoltageAlarm() {
        return interHarmonicVoltageAlarm;
    }

    public void setInterHarmonicVoltageAlarm(Integer interHarmonicVoltageAlarm) {
        this.interHarmonicVoltageAlarm = interHarmonicVoltageAlarm;
    }

    public Integer getThreePhaseVolImbalanceAlarm() {
        return threePhaseVolImbalanceAlarm;
    }

    public void setThreePhaseVolImbalanceAlarm(Integer threePhaseVolImbalanceAlarm) {
        this.threePhaseVolImbalanceAlarm = threePhaseVolImbalanceAlarm;
    }

    public Integer getNegativeSequenceCurAlarm() {
        return negativeSequenceCurAlarm;
    }

    public void setNegativeSequenceCurAlarm(Integer negativeSequenceCurAlarm) {
        this.negativeSequenceCurAlarm = negativeSequenceCurAlarm;
    }

    public Integer getLongTimeFlickerAlarm() {
        return longTimeFlickerAlarm;
    }

    public void setLongTimeFlickerAlarm(Integer longTimeFlickerAlarm) {
        this.longTimeFlickerAlarm = longTimeFlickerAlarm;
    }

    public Integer getThduAlarm() {
        return thduAlarm;
    }

    public void setThduAlarm(Integer thduAlarm) {
        this.thduAlarm = thduAlarm;
    }
}