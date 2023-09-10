# Utkommentert itilfelle det ødelegger noe med gradle senere..

# import requests
# import json



# def get_bike_availability(station_id):
#     headers = {
#         'Client-Identifier': 'BysykkelStatus',
#     }

#     response = requests.get('https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json', headers=headers)

#     data = json.loads(response.text)

#     for station in data['data']['stations']:
#         if station['station_id'] == station_id:
#             return station['num_bikes_available']

#     return 'Station not found'

# # print(get_bike_availability('421'))