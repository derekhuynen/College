package com.College;

public enum Major {
    BUSINESS("Business"),
    SOCIAL_SCIENCES("Social Science"),
    PSYCHOLOGY("Psychology"),
    HISTORY("History"),
    EDUCATION("Education"),
    COMPUTER_SCIENCE("Computer Science"),
    PHILOSOPHY("Science"),
    ENGINEERING("Engineering");

    private final String name;

    Major (String name) {
        this.name = name;
    }
}
