from flask import Flask
import mysql.connector

app = Flask(__name__)

@app.route('/')
def display_data():
    connection = mysql.connector.connect(
        host='mysql',
        user='myuser',
        password='mypassword',
        database='mydb'
    )

    cursor = connection.cursor()
    query = 'SELECT * FROM data'
    cursor.execute(query)
    result = cursor.fetchall()

    html = ''
    for row in result:
        html += 'Name: ' + str(row[1]) + '<br>'
        html += 'Number: ' + str(row[2]) + '<br>'
        html += 'Class: ' + str(row[3]) + '<br>'
        html += '<br>'

    connection.close()

    return html

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8000)
