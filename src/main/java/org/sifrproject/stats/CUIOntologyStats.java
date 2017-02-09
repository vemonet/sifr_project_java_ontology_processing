package org.sifrproject.stats;


public final class CUIOntologyStats extends OntologyStats{

    //Statistics constants
    public static final String TOTAL_CLASS_COUNT_STATISTIC = "totalClassCount";
    public static final String CLASSES_WITHOUT_CUI_STATISTIC = "classesWithoutCUI";
    public static final String CLASSES_WITH_CUI_IN_ALT_LABEL_STATISTIC = "classesWithCUIInAltLabel";
    public static final String CLASSES_WITH_CUI_IN_MAPPINGS_STATISTIC = "classesWithCUIInMappings";
    public static final String CLASSES_WITH_AMBIGUOUS_CUI_STATISTIC = "classesWithAmbiguousCUI";
    public static final String CLASSES_REMAINING_WITHOUT_CUI_STATISTIC = "classesRemainingWithoutCUI";
    public static final String CLASSES_REMAINING_WITHOUT_TUI_STATISTIC = "classesRemainingWithoutTUI";
    public static final String CLASSES_WITHOUT_TUI_STATISTIC = "classesWithoutTUI";

    @SuppressWarnings("HardcodedFileSeparator")
    public CUIOntologyStats(final String ontologyName) {
        super(ontologyName);
        registerStatistic(TOTAL_CLASS_COUNT_STATISTIC,"#Classes");
        registerStatistic(CLASSES_WITHOUT_CUI_STATISTIC,"w/o CUI");
        registerStatistic(CLASSES_WITHOUT_TUI_STATISTIC, "w/o TUI");
        registerStatistic(CLASSES_WITH_CUI_IN_ALT_LABEL_STATISTIC, "CUI in altLabel");
        registerStatistic(CLASSES_WITH_CUI_IN_MAPPINGS_STATISTIC, "CUI in mappings");
        registerStatistic(CLASSES_WITH_AMBIGUOUS_CUI_STATISTIC, "Ambiguous CUI");
        registerStatistic(CLASSES_REMAINING_WITHOUT_CUI_STATISTIC, "#Classes remaining without CUI");
        registerStatistic(CLASSES_REMAINING_WITHOUT_TUI_STATISTIC, "#Classes remaining without TUI");
    }
}