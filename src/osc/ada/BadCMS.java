package osc.ada;

import java.util.Scanner;

public class BadCMS {
    public static void main(String[] args) {
        NewsList newsList = new NewsList();
        Scanner s = new Scanner(System.in);
        int select;
        do {
            System.out.println("Select option");
            System.out.println("1. Add news");
            System.out.println("2. View news");
            System.out.println("3. Find news");
            System.out.println("4. Delete news");
            System.out.println("5. Exit");

            select = s.nextInt();
            s.nextLine();

            if (select == 1) {
                System.out.println("Enter author name");
                String name = s.nextLine();
                System.out.println("Enter author surname");
                String surname = s.nextLine();
                System.out.println("Enter news title");
                String title = s.nextLine();
                System.out.println("Enter news category");
                String category = s.nextLine();

                newsList.addNews(new News(name, surname, title, category));
            } else if (select == 2) {
                for (int i = 0; i < newsList.size(); i++) {
                    News news = newsList.getNews(i);
                    System.out.println(i + ": " + news.getAuthorName() + " " + news.getAuthorSurname() + " " + news.getNewsTitle() + " " + news.getCategory());
                }
            } else if (select == 3) {
                int choice;
                do {

                    System.out.println("Select search option:");
                    System.out.println("1. By author name");
                    System.out.println("2. By author surname");
                    System.out.println("3. By title");
                    System.out.println("4. By category");
                    System.out.println("5. Exit");

                    choice = s.nextInt();
                    s.nextLine();

                    if (choice == 1) {

                        String aName;
                        System.out.println("Enter author name");
                        aName = s.nextLine();
                        for (int i = 0; i < newsList.size(); i++) {
                            News news = newsList.getNews(i);
                            if (news.getAuthorName().equals(aName)) {
                                System.out.println(i + ": " + news.getAuthorName() + " " + news.getAuthorSurname() + " " + news.getNewsTitle() + " " + news.getCategory());
                            }

                        }
                    } else if (choice == 2) {
                        String aSurname;
                        System.out.println("Enter author name");
                        aSurname = s.nextLine();
                        for (int i = 0; i < newsList.size(); i++) {
                            News news = newsList.getNews(i);
                            if (news.getAuthorSurname().equals(aSurname)) {
                                System.out.println(i + ": " + news.getAuthorName() + " " + news.getAuthorSurname() + " " + news.getNewsTitle() + " " + news.getCategory());
                            }

                        }
                    } else if (choice == 3) {
                        String aTitle;
                        System.out.println("Enter title");
                        aTitle = s.nextLine();
                        for (int i = 0; i < newsList.size(); i++) {
                            News news = newsList.getNews(i);
                            if (news.getNewsTitle().equals(aTitle)) {
                                System.out.println(i + ": " + news.getAuthorName() + " " + news.getAuthorSurname() + " " + news.getNewsTitle() + " " + news.getCategory());
                            }

                        }
                    } else if (choice == 4) {
                        String aCategory;
                        System.out.println("Enter category name");
                        aCategory = s.nextLine();
                        for (int i = 0; i < newsList.size(); i++) {
                            News news = newsList.getNews(i);
                            if (news.getCategory().equals(aCategory)) {
                                System.out.println(i + ": " + news.getAuthorName() + " " + news.getAuthorSurname() + " " + news.getNewsTitle() + " " + news.getCategory());
                            }

                        }

                    }
                } while (choice != 5);
            } else if (select == 4) {
                int deleter;
                System.out.println("Select the number in front of the News entry you wish to delete");
                for (int i = 0; i < newsList.size(); i++) {
                    News news = newsList.getNews(i);
                    System.out.println(i + ": " + news.getAuthorName() + " " + news.getAuthorSurname() + " " + news.getNewsTitle() + " " + news.getCategory());
                }
                deleter=s.nextInt();
                s.nextLine();
                newsList.removeNewsAt(deleter);


            }


        } while (select != 5);
    }
}
