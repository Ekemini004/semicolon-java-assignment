    import java.util.Scanner;

    public class NokiaPhoneMenu{

    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    String Menu = """ 

    ════════════════════════════════
           📱 PHONE MENU
    ════════════════════════════════

          1. Phone book
          2. Messages
          3. Chats
          4. Call Register 
          5. Tones
          6. Settings                     
          7. Call Divert
          8. Music
          9. Games
          10. Calculator
          11. Reminders
          12. Clock
          13. Profiles
          14. Services
          15. SIM services


    ════════════════════════════════
        

    """;


    System.out.println(Menu);

    int userChoice = input.nextInt();


    switch (userChoice) {

        case 1->{

        String PhoneBookMenu = """ 
        
        You are now on the phone book
        Menu, please enter a number 
        to select an option.

        ════════════════════════════════
               📱 PHONE BOOK MENU
        ════════════════════════════════

              1. Search
              2. Service Nos.
              3. Add name
              4. Erase
              5. Edit
              6. Copy                     
              7. Assign tone
              8. Send b'card
              9. Options

        ════════════════════════════════

        """;  

        System.out.println(PhoneBookMenu);

                
         int phoneBookMenuChoice = input.nextInt();
         switch (phoneBookMenuChoice) {
                            
                     case 1 -> System.out.println("You are now on the search menu");
                     case 2-> System.out.println("You are now on the Service Nos menu");
                     case 3-> System.out.println("You are now on the Add name  menu");
                     case 4-> System.out.println("You are now on the Erase menu");
                     case 5-> System.out.println("You are now on the Edit menu");
                     case 6-> System.out.println("You are now on the Copy menu");
                     case 7-> System.out.println("You are now on the Assign tone menu");
                     case 8-> System.out.println("You are now on the Send b'card menu");
                     case 9-> System.out.println("do nested for this");
                     case 10-> System.out.println("You are now on the Speed dials menu");
                     case 11-> System.out.println("You are now on the Voice tags menu");
                        
                            }    

    }                      

        case 2-> {

        String messageMenu = """ 
        
        You are now on the Message Menu.
        Please enter a number
        to select an option.

        ════════════════════════════════
              📱 MESSAGE MENU
        ════════════════════════════════

              1. Write Messages
              2. Inbox
              3. Received calls
              4. Dialed numbers
              5. Erase recent call lists
              6. Show call duration                     
              7. Show call costs
              8. Call cost settings
              9. Prepaid credit

        ════════════════════════════════
            

        """;  

        System.out.println(messageMenu);

        int messageMenuChoice = input.nextInt();

          switch (messageMenuChoice) {
                            
                     case 1-> { System.out.println("You are now on the Write messages menu"); }
                     case 2-> { System.out.println("You are now on the Inbox menu"); }
                     case 3-> { System.out.println("You are now on the Received Calls menu"); }
                     case 4-> { System.out.println("You are now on the Dialed numbers menu"); }
                     case 5-> { System.out.println("You are now on the Erase recent call lists menu"); }
                     case 6 -> {

                            String showCallDuration = """ 
                            
                            You are now on the Show call duration Menu.
                            Please enter a number
                            to select an option.

                            ════════════════════════════════
                               📱 SHOW CALL DURATION MENU
                            ════════════════════════════════

                                  1. Last Call Duration
                                  2. All calls Duration
                                  3. Received calls duration
                                  4. Dialed calls duration
                                  5. Clear timers

                            ════════════════════════════════
                                

                            """;   
                            System.out.println(showCallDuration);

                            int showCallDurationChoice = input.nextInt();      
 
                                     switch (showCallDurationChoice) {
                                            
                                     case 1-> System.out.println("You are now on the Last Call duration menu");
                                     case 2-> System.out.println("You are now on all calls duration menu");
                                     case 3-> System.out.println("You are now on the Received Calls duration menu");
                                     case 4-> System.out.println("You are now on the Dialed calls duration menu");
                                     case 5-> System.out.println("You are now on the clear timers menu");
                                        
                                        }
                                     }
               
                           
                            case 7 -> {

                            String showCallCosts = """ 
                            
                            You are now on the Show call duration Menu.
                            Please enter a number
                            to select an option.

                            ════════════════════════════════
                               📱 SHOW CALL COSTS MENU
                            ════════════════════════════════

                                  1. Last Call Cost
                                  2. All calls Cost
                                  3. Clear Counters
                         
                            ════════════════════════════════
                                

                            """;  
 
                            System.out.println(showCallCosts);

                            int showCallCostChoice = input.nextInt();      
 
                                     switch (showCallCostChoice) {
                                            
                                     case 1-> System.out.println("You are now on the Last Call cost menu");
                                     case 2-> System.out.println("You are now on all calls cost menu");
                                     case 3-> System.out.println("You are now on the clear counters menu");                   
                                         }
                                       }


                            case 8 -> {

                            String showCallCostSettings = """ 
                            
                            You are now on the Show call duration Menu.
                            Please enter a number
                            to select an option.

                            ════════════════════════════════
                            📱 SHOW CALL COSTS SETTINGS MENU
                            ════════════════════════════════

                                  1. Last Call Cost
                                  2. All calls Cost
                                  3. Clear Counters
                         
                            ════════════════════════════════
                                

                            """;  
 
                            System.out.println(showCallCostSettings);

                            int showCallCostSettingsChoice = input.nextInt();      
 
                                     switch (showCallCostSettingsChoice) {
                                            
                                     case 1-> System.out.println("You are now on the Last Call cost limit menu");
                                     case 2-> System.out.println("You are now on show cost in menu");             
                                         }
                                       }
        

                                    }                       

            
      } 

        case 3-> System.out.println("You are now on the Chat menu");
    
        case 4 -> {

                            String showCallRegister = """ 
                            
                            You are now on the Call Register Menu.
                            Please enter a number
                            to select an option.

                            ════════════════════════════════
                            📱 SHOW CALL REGISTER MENU
                            ════════════════════════════════

                                  1. Missed Calls
                         
                            ════════════════════════════════
                                

                            """;  
 
                            System.out.println(showCallRegister);

                            int showCallRegisterChoice = input.nextInt();      
 
                                     switch (showCallRegisterChoice) {
                                            
                                     case 1-> System.out.println("You are now on the Missed Call menu");
                                         }
                                       }
            


    case 5 -> {

                            String showTonesMenu = """ 
                            
                            You are now on the Call Register Menu.
                            Please enter a number
                            to select an option.

                            ════════════════════════════════
                                  📱 SHOW TONES MENU
                            ════════════════════════════════

                                  1. Ringing tone
                                  2. Ringing volume
                                  3. Incoming call alert
                                  4. Message alert tone
                                  5. Keypad tones
                         
                            ════════════════════════════════
                                

                            """;  
 
                            System.out.println(showTonesMenu);

                            int showTonesMenuChoice = input.nextInt();      
 
                                     switch (showTonesMenuChoice) {
                                            
                                     case 1-> System.out.println("You are now on the Ringing tone Menu");                              case 2-> System.out.println("You are now on the Ringing volume menu");                              case 3-> System.out.println("You are now on the Incoming call alert menu");                        case 4-> System.out.println("You are now on the Message alert tone menu");                         case 6-> System.out.println("You are now on the Keypad tones menu");                              case 7-> System.out.println("You are now on the Vibrating alert menu");                              case 8-> System.out.println("You are now on the Screen saver menu");
                                         }
                                       }
    

        case 6 -> {

                            String settingsMenu = """ 
                            
                            You are now on the Settings Menu.
                            Please enter a number
                            to select an option.

                            ════════════════════════════════
                                  📱 SETTINGS MENU
                            ════════════════════════════════

                                  1. Call Settings
                                  2. Phone Settings
                                  3. Security Settings
                                  4. Restore factory settings
                                  
                            ════════════════════════════════
                                

                            """;  
 
                            System.out.println(settingsMenu);

                            int settingsMenuChoice = input.nextInt();      
 
                                     switch (settingsMenuChoice) {
                                            
                                     case 1-> {
                                        
                                            String callSettings = """ 
                                            
                                            You are now on the Call Settings Menu.
                                            Please enter a number
                                            to select an option.

                                            ════════════════════════════════
                                                  📱 CALL SETTINGS MENU
                                            ════════════════════════════════

                                                  1. Automatic redial
                                                  2. Speed dialing
                                                  3. Call waiting options
                                                  4. Own number sending
                                                  5. Phone line in use
                                                  6. Automatic answer
                                                  
                                            ════════════════════════════════
                                                

                                            """;  
                 
                                            System.out.println(callSettings);

                                            int callSettingsMenuChoice = input.nextInt();      
                 
                                                     switch (callSettingsMenuChoice) {
                                                               
                                      case 1-> System.out.println("You are now on the Automatic redial Menu");                         
                                      case 2-> System.out.println("You are now on the speed dialing menu");                            
                                      case 3-> System.out.println("You are now on the call own number sending menu");                       
                                      case 4-> System.out.println("You are now on the phone line in use menu");                        
                                      case 6-> System.out.println("You are now on the Keypad tones Menu");
                                                      }                                         
                                         
                                      }

                                        
                                     case 2-> {
                                        
                                            String phoneSettingsMenu = """ 
                                            
                                            You are now on the phone Settings Menu.
                                            Please enter a number
                                            to select an option.

                                            ════════════════════════════════
                                                 📱 PHONE SETTINGS MENU
                                            ════════════════════════════════

                                                  1. Language
                                                  2. Cell Info display
                                                  3. Welcome note
                                                  4. Network Selection
                                                  5. Confirm SIM service actions
                                                  
                                            ════════════════════════════════
                                                

                                            """;  
                 
                                            System.out.println(phoneSettingsMenu);

                                            int phoneSettingsMenuChoice = input.nextInt();      
                 
                                                     switch (phoneSettingsMenuChoice) {
                                                               
                                      case 1-> System.out.println("You are now on the Language Menu");                         
                                      case 2-> System.out.println("You are now on the Cell Info display menu");                            
                                      case 3-> System.out.println("You are now on the WElcome note  menu");                       
                                      case 4-> System.out.println("You are now on the Network selection  menu");                        
                                      case 6-> System.out.println("You are now on the Confirm sim service actions Menu");
                                                      }                                         
                                    
                                      }

                                     case 3-> {
                                        
                                            String securitySettingsMenu = """ 
                                            
                                            You are now on the security Settings Menu.
                                            Please enter a number
                                            to select an option.

                                            ════════════════════════════════
                                                📱 SECURITY SETTINGS MENU
                                            ════════════════════════════════

                                                  1. PINcode request
                                                  2. Call barring service
                                                  3. Fixed dialing
                                                  4. Closed user group
                                                  5. Security level
                                                  6. Change access codes
                                                  
                                            ════════════════════════════════
                                                

                                            """;  
                 
                                            System.out.println(securitySettingsMenu);

                                            int securitySettingsMenuChoice = input.nextInt();      
                 
                                                     switch (securitySettingsMenuChoice) {
                                                               
                                      case 1-> System.out.println("You are now on the PIN code request Menu");                         
                                      case 2-> System.out.println("You are now on the call barring service menu");                            
                                      case 3-> System.out.println("You are now on the fixed dialing  menu");                       
                                      case 4-> System.out.println("You are now on the closed user group menu");                        
                                      case 6-> System.out.println("You are now on the security level Menu");                                
                                      case 7-> System.out.println("You are now on the change access codes Menu"); 


                                                      }                                         
                                         
                                      }

                                   case 4-> System.out.println("You are now on the Restore Factory Settings menu");                                                

                                         }
                                       }



         case 7-> System.out.println("You are now on the Call Divert menu"); 
                      
         case 8-> {
                                        
                                            String musicMenu = """ 
                                            
                                            You are now on the Music Settings Menu.
                                            Please enter a number
                                            to select an option.

                                            ════════════════════════════════
                                                 📱 MUSIC SETTINGS MENU
                                            ════════════════════════════════

                                                  1. Music player
                                                  2. Radio
                                                  3. Recorder
                                                  4. Track list
                                            
                                            ════════════════════════════════
                                                

                                            """;  
                 
                                            System.out.println(musicMenu);

                                            int musicMenuChoice = input.nextInt();      
                 
                                       switch (musicMenuChoice) {
                                                               
                                      case 1-> System.out.println("You are now on the Music Player Menu");                         
                                      case 2-> System.out.println("You are now on the Radio menu");                            
                                      case 3-> System.out.println("You are now on the Recorder  menu");                       
                                      case 4-> System.out.println("You are now on the Track List  menu");   
         
                                                      }                                         
                                    
                                      }        


    
        case 9-> System.out.println("You are now on the Games"); 
        case 10-> System.out.println("You are now on the Calculator");
        case 11-> System.out.println("You are now on the Reminders");  

        case 12-> {
                                        
                                            String clockMenu = """ 
                                            
                                            You are now on the Music Settings Menu.
                                            Please enter a number
                                            to select an option.

                                            ════════════════════════════════
                                                 📱 CLOCK SETTINGS MENU
                                            ════════════════════════════════

                                                  1. Alarm Clock
                                                  2. Clock Settings
                                                  3. Date Settings
                                                  4. Stop watch
                                                  5. Countdown Timer
                                                  6. Auto update of date and time

                                            ════════════════════════════════
                                                

                                            """;  
                 
                                            System.out.println(clockMenu);

                                            int clockMenuChoice = input.nextInt();      
                 
                                       switch (clockMenuChoice) {
                                                               
                                      case 1-> System.out.println("You are now on the Alarm Clock Menu");                         
                                      case 2-> System.out.println("You are now on the Clock settings menu");                            
                                      case 3-> System.out.println("You are now on the Date Settings  menu");                       
                                      case 4-> System.out.println("You are now on the Stopwatch menu");
                                      case 5-> System.out.println("You are now on the Countdown timer menu"); 
                                      case 6-> System.out.println("You are now on the Auto update of date and time menu");      
         
                                                      }                                         
                                    
                                      }        





        case 13-> System.out.println("You are now on the Profiles Menu"); 
        case 14-> System.out.println("You are now on the Services Menu");
        case 15-> System.out.println("You are now on the Sim Services Menu"); 


























            
            }







        }


       }
