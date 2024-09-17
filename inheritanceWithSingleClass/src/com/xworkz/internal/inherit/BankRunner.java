package com.xworkz.internal.inherit;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank;
        Bank bank1=new UnionBank() {
            @Override
            public int dormantAccountPolicies() {
                System.out.println("===========");
                return 0;
            }

            @Override
            public int requirementsForAccountOpening() {
                System.out.println("------------");
                return 0;
            }

            @Override
            public double minimumBalanceRequirements() {
                return 0;
            }

            @Override
            public double overDraftPoliciedAndFees() {
                return 0;
            }
        };
        Bank bank2=new AxisBank() {
            @Override
            public int BankingHours() {
                return 0;
            }

            @Override
            public String HolidaySchedule() {
                return "";
            }

            @Override
            public int dormantAccountPolicies() {
                return 0;
            }

            @Override
            public int requirementsForAccountOpening() {
                return 0;
            }

            @Override
            public double minimumBalanceRequirements() {
                return 0;
            }

            @Override
            public double overDraftPoliciedAndFees() {
                return 0;
            }
        };
    }
}
