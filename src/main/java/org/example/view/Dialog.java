package org.example.view;

import org.example.controller.CarController;
import org.example.controller.ClientController;
import org.example.controller.Face2FaceRentController;
import org.example.controller.WebRentController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dialog {
    private ClientController clientController;
    private CarController carController;

    private Face2FaceRentController f2fRentController;

    private WebRentController webRentController;
    private Scanner scanner;

    public Dialog() {
        clientController = new ClientController();
        carController = new CarController();
        f2fRentController= new Face2FaceRentController();
        webRentController= new WebRentController();
    }

    public void getStarted() {
        do {
            System.out.println("\n********************** Welcome to Rent A Car *****************************");
            System.out.println("\n\t1. Manage Clients.\t\t\t\t\t4. Manage Models.");
            System.out.println("\n\t2. Manage Cars.\t\t\t\t\t\t5. Manage Rents.");
            System.out.println("\n\t3. Manage Offices.\t\t\t\t\t0. Exit.");
            System.out.println("\n**************************************************************************");
            scanner = new Scanner(System.in);
            try {
                int choice = scanner.nextInt();
                if (choice == 1) clientManager();
                else if (choice == 2) { carManager();}
                else if (choice == 3) { rentManager();}
                else if (choice == 4) { /*TODO*/}
                else if (choice == 5) { /*TODO*/}
                else if (choice == 0) {
                    System.out.println("Bye!!");
                    System.exit(0);
                    ;
                } else System.err.println("[ERROR] Your option is incorrect!! Try again!!");
            } catch (InputMismatchException e) {
                System.err.println("[ERROR] You must type a number!!!");
                scanner.next();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }



    public void clientManager() {do {
            System.out.println("\n************************** Client Manager ********************************");
            System.out.println("\n\t1. Create Client.\t\t\t\t4. Search Client.");
            System.out.println("\n\t2. Remove Client.\t\t\t\t5. See All Clients.");
            System.out.println("\n\t3. Update Client.\t\t\t\t0. Back.");
            System.out.println("\n**************************************************************************");
            int choice = scanner.nextInt();
            try {
                if (choice == 1) {
                    scanner.nextLine();
                    System.out.println("Dni: ");
                    String dni = scanner.nextLine();
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Surname: ");
                    String surname = scanner.nextLine();
                    clientController.add(dni, name, surname);
                } else if (choice == 2) {
                    System.out.println("Client ID: ");
                    int id = scanner.nextInt();
                    clientController.deleteById((long) id);
                } else if (choice == 3) {
                    System.out.println(clientController.findAll());
                    System.out.println("Client ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Dni: ");
                    String dni = scanner.nextLine();
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Surname: ");
                    String surname = scanner.nextLine();
                    clientController.update((long) id, dni, name, surname);
                } else if (choice == 4) {
                    scanner.nextLine();
                    System.out.println("Dni: ");
                    String dni = scanner.nextLine();
                    System.out.println(clientController.findByDni(dni));
                } else if (choice == 5) System.out.println(clientController.findAll());
                else if (choice == 0) getStarted();
                else System.err.println("[ERROR] Your option is incorrect!! Try again!!");
            } catch (InputMismatchException e) {
                System.err.println("[ERROR] You must type a number!!!");
                scanner.next();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);}

    public void carManager() {
        do {
            System.out.println("\n************************** Client Manager ********************************");
            System.out.println("\n\t1. Create CAR.\t\t\t\t4. Search CAR.");
            System.out.println("\n\t2. Remove CAR.\t\t\t\t5. See All CARS.");
            System.out.println("\n\t3. Update CAR.\t\t\t\t0. Back.");
            System.out.println("\n**************************************************************************");
            int choice = scanner.nextInt();
            try {
                if (choice == 1) {
                    scanner.nextLine();
                    System.out.println("License Plate: ");
                    String licensePlate = String.valueOf(scanner.nextInt());
                    carController.add(licensePlate);
                } else if (choice == 2) {
                    System.out.println("Car ID: ");
                    int id = scanner.nextInt();
                    carController.deleteByIdCar((long) id);
                } else if (choice == 3) {
                    System.out.println(carController.findAll());
                    System.out.println("Car ID: ");
                    int id = scanner.nextInt();
                    System.out.println("License Plate: ");
                    String licensePlate = String.valueOf(scanner.nextInt());
                    scanner.nextLine();
                    carController.updateCar((long) id,licensePlate);
                } else if (choice == 4) {
                    scanner.nextLine();
                    System.out.println("Car ID: ");
                    long idCar = scanner.nextLong();
                    System.out.println(carController.findByIdCar(idCar));
                } else if (choice == 5) System.out.println(carController.findAll());
                else if (choice == 0) getStarted();
                else System.err.println("[ERROR] Your option is incorrect!! Try again!!");
            } catch (InputMismatchException e) {
                System.err.println("[ERROR] You must type a number!!!");
                scanner.next();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }
    private void rentManager() {
        do {
            System.out.println("\n************************** Client Manager ********************************");
            System.out.println("\n\t1. Create Rent Face 2 Face.\t\t\t\t5. Search Rent.");
            System.out.println("\n\t2. Create Rent Web.\t\t\t\t6. See All Rent.");
            System.out.println("\n\t3. Remove Rent.\t\t\t\t0. Back.");
            System.out.println("\n\t4. Update Rent.\t\t\t\t");
            System.out.println("\n**************************************************************************");
            int choice = scanner.nextInt();
            try {
                if (choice == 1) {
                    //Se que no tiene mucho sentido hacer la busqueda por id deberia ser por matricula
                    scanner.nextLine();
                    System.out.println("Id Car: ");
                    long idcar = scanner.nextInt();
                    carController.findByIdCar(idcar);
                    System.out.println("DNI: ");
                    String dni = scanner.nextLine();
                    System.out.println("Fecha de recogida dd/MM/yy: ");
                    String fRecogida= scanner.nextLine();
                    System.out.println("Fecha de recogida dd/MM/yy: ");
                    String fEntrega= scanner.nextLine();
                    f2fRentController.createRent(carController.findByIdCar(idcar),clientController.findByDni(dni),,convertirStringDate(fRecogida),convertirStringDate(fEntrega));
                    clientController.findByDni(dni);
                } else if (choice == 2) {
                    System.out.println("Car ID: ");
                    int id = scanner.nextInt();
                    carController.deleteByIdCar((long) id);
                } else if (choice == 3) {
                    System.out.println(carController.findAll());
                    System.out.println("Car ID: ");
                    int id = scanner.nextInt();
                    System.out.println("License Plate: ");
                    String licensePlate = String.valueOf(scanner.nextInt());
                    scanner.nextLine();
                    carController.updateCar((long) id,licensePlate);
                } else if (choice == 4) {
                    scanner.nextLine();
                    System.out.println("Car ID: ");
                    long idCar = scanner.nextLong();
                    System.out.println(carController.findByIdCar(idCar));
                } else if (choice == 5) System.out.println(carController.findAll());
                else if (choice == 0) getStarted();
                else System.err.println("[ERROR] Your option is incorrect!! Try again!!");
            } catch (InputMismatchException e) {
                System.err.println("[ERROR] You must type a number!!!");
                scanner.next();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }
    public static Date conseguirFechaActual(){
        Calendar calendario = Calendar.getInstance();
        Date fechaActual = calendario.getTime();
        return fechaActual;
    }

    public static Date convertirStringDate(String entrada){
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
        Date fecha = null;
        while (fecha == null) {
            try {
                fecha = formato.parse(entrada);
            } catch (ParseException e) {
                System.out.println("El formato de la fecha no es válido.");
            }
        }
        return fecha;
    }
}
