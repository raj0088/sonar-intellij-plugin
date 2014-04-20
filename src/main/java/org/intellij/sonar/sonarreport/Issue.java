package org.intellij.sonar.sonarreport;

import org.joda.time.DateTime;

public class Issue {

  private String key;
  private String component;
  private Integer line;
  private String message;
  private String severity;
  private String rule;
  private String status;
  private Boolean isNew;
  private DateTime creationDate;
  private DateTime updateDate;

  public Issue(String key, String component, Integer line, String message, String severity, String rule, String status, Boolean isNew, DateTime creationDate, DateTime updateDate) {
    this.key = key;
    this.component = component;
    this.line = line;
    this.message = message;
    this.severity = severity;
    this.rule = rule;
    this.status = status;
    this.isNew = isNew;
    this.creationDate = creationDate;
    this.updateDate = updateDate;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }

  public void setCreationDate(DateTime creationDate) {
    this.creationDate = creationDate;
  }

  public void setUpdateDate(DateTime updateDate) {
    this.updateDate = updateDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Issue issue = (Issue) o;

    if (component != null ? !component.equals(issue.component) : issue.component != null)
      return false;
    if (creationDate != null ? !creationDate.equals(issue.creationDate) : issue.creationDate != null)
      return false;
    if (isNew != null ? !isNew.equals(issue.isNew) : issue.isNew != null)
      return false;
    if (key != null ? !key.equals(issue.key) : issue.key != null)
      return false;
    if (line != null ? !line.equals(issue.line) : issue.line != null)
      return false;
    if (message != null ? !message.equals(issue.message) : issue.message != null)
      return false;
    if (rule != null ? !rule.equals(issue.rule) : issue.rule != null)
      return false;
    if (severity != null ? !severity.equals(issue.severity) : issue.severity != null)
      return false;
    if (status != null ? !status.equals(issue.status) : issue.status != null)
      return false;
    if (updateDate != null ? !updateDate.equals(issue.updateDate) : issue.updateDate != null)
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = key != null ? key.hashCode() : 0;
    result = 31 * result + (component != null ? component.hashCode() : 0);
    result = 31 * result + (line != null ? line.hashCode() : 0);
    result = 31 * result + (message != null ? message.hashCode() : 0);
    result = 31 * result + (severity != null ? severity.hashCode() : 0);
    result = 31 * result + (rule != null ? rule.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    result = 31 * result + (isNew != null ? isNew.hashCode() : 0);
    result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
    result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Issue{" +
        "key='" + key + '\'' +
        ", component='" + component + '\'' +
        ", line=" + line +
        ", message='" + message + '\'' +
        ", severity='" + severity + '\'' +
        ", rule='" + rule + '\'' +
        ", status='" + status + '\'' +
        ", isNew=" + isNew +
        ", creationDate=" + creationDate +
        ", updateDate=" + updateDate +
        '}';
  }
}
