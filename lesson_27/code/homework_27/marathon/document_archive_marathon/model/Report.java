package homework_27.marathon.document_archive_marathon.model;

public class Report extends Document {

    String reportType;


    public Report(int id, String author, int yearOfIssue, String name, String reportType) {
        super(id, author, yearOfIssue, name);
        this.reportType = reportType;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return "Report{" +
                "reportType='" + reportType + '\'' +
                "} " + super.toString();
    }
}
