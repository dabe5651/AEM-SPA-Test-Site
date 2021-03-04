package com.myspasite.core.models;
import com.adobe.cq.export.json.ComponentExporter;

public interface StatComponent extends ComponentExporter {
    public String getTitle();
    public String getDescription();
    public String getSubtitle();
}