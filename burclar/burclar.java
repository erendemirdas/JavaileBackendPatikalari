import java.util.Scanner;
public class burclar {
    public static void main(String[] args) {
        int day, mouth;
        boolean isError = false ;
        String burc ="";

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen doğduğunuz günü girin  : ");
        day = inp.nextInt();
        System.out.print("Lütfen doğduğunuz ayı girin (1-12) : ");
        mouth = inp.nextInt();

        // **** BURCLAR -START- ****
        if (mouth >= 1 && mouth <=12){
            // ** OCAK **
            if (mouth == 1) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        burc = "OĞLAK";
                    } else {
                        burc = "KOVA";
                    }
                }else {
                    isError = true;
                }
            }

            // ** ŞUBAT **
            if (mouth == 2) {
                if (day >= 1 && day <= 29) {
                    if (day <= 19) {
                        burc = "KOVA";
                    } else {
                        burc = "BALIK";
                    }
                }else {
                    isError = true;
                }
            }

            // ** MART **
            if (mouth == 3) {
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        burc = "BALIK";
                    } else {
                        burc = "KOÇ";
                    }
                }else {
                    isError = true;
                }
            }

            // ** NİSAN **
            if (mouth == 4) {
                if (day >= 1 && day <= 30) {
                    if (day <= 20) {
                        burc = "KOÇ";
                    } else {
                        burc = "BOĞA";
                    }
                }else {
                    isError = true;
                }
            }

            // ** MAYIS **
            if (mouth == 5) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        burc = "BOĞA";
                    } else {
                        burc = "İKİZLER";
                    }
                }else {
                    isError = true;
                }
            }

            // ** HAZİRAN **
            if (mouth == 6) {
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        burc = "İKİZLER";
                    } else {
                        burc = "YENGEÇ";
                    }
                }else {
                    isError = true;
                }
            }

            // ** TEMMUZ **
            if (mouth == 7) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        burc = "YENGEÇ";
                    } else {
                        burc = "ASLAN";
                    }
                } else {
                    isError = true;
                }
            }

            // ** AĞUSTOS **
            if (mouth == 8) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        burc = "ASLAN";
                    } else {
                        burc = "BAŞAK";
                    }
                } else {
                    isError = true;
                }
            }

            // ** EYLÜL **
            if (mouth == 9) {
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        burc = "BAŞAK";
                    } else {
                        burc = "TERAZİ";
                    }
                } else {
                    isError = true;
                }
            }

            // ** EKİM **
            if (mouth == 10) {
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        burc = "TERAZİ";
                    } else {
                        burc = "AKREP";
                    }
                } else {
                    isError = true;
                }
            }

            // ** KASIM **
            if (mouth == 11) {
                if (day >= 1 && day <= 30) {
                    if (day <= 21) {
                        burc = "AKREP";
                    } else {
                        burc = "YAY";
                    }
                } else {
                    isError = true;
                }
            }

            // ** ARALIK **
            if (mouth == 12) {
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        burc = "YAY";
                    } else {
                        burc = "OĞLAK";
                    }
                } else {
                    isError = true;
                }
            }
        }else {
            isError = true;
        }
        // **** BURCLAR -END- ****

        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız !!");
        }else {
            System.out.println("BURCUNUZ : " + burc);
        }

    }
}
