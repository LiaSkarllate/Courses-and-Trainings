import requests;

domain = 'bbc.co.uk'

list = ["admin", "logins", "css", "sport", "css"];
list_from_wordlist = [];

wordlist = open("Passos/3/subdomains_list.txt");

for word in wordlist:
    list_from_wordlist.append(word.strip())


for item in list_from_wordlist:
    sub_to_check = f"http://{item}.{domain}";
    try:
        response = requests.get(sub_to_check);
        print(sub_to_check);
    except:
        print("Not yet.");
        continue;  