import requests;

list = ["admin", "logins", "css", "sport", "css"];
host = 'http://www.bbc.co.uk/'

for item in list:
    url_to_check = host + item;
    response = requests.get(url_to_check);

    if(response.status_code == 200):
        print(url_to_check);
    else:
        continue;
