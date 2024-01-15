Feature: Test fb register page

  Scenario Outline: Test register page functionality
    Given user is on register page
    When user enter valide"<Fname>","<lname>","<mobileno.>","<pass>"
    And user enter valide"<Day>","<Mont>","<Year>" and "<gender>"

    Examples: |fname|lname|mobileno.|pass|Day|Mont|Year|gender|
      | ramu | Samal | 909090 | Raj@rr |  8 | Oct | 2023 | male |
      | raju | Samal | 909890 | Raj@rr | 11 | Oct | 2023 | male |
